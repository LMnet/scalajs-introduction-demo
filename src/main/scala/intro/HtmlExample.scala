package intro

import org.scalajs.dom

import scala.collection.mutable

object HtmlExample {

  case class User(name: String, role: Role)

  trait Role
  object Role {
    case object Admin extends Role
    case object User extends Role
    case class Moderator(permissions: Set[Permission] = Set.empty) extends Role
  }

  trait Permission
  object Permission {
    case object AddUser extends Permission
    case object ChangeUser extends Permission
    case object DeleteUser extends Permission
  }

  def main(): Unit = {

    import scalatags.JsDom.all._

    val users = mutable.Buffer.empty[User]

    val nameInput = input(`type` := "text", placeholder := "Имя").render
    val roleSelect = select(
      option(value := "Admin", "Админ"),
      option(value := "User", "Пользователь"),
      option(value := "Moderator", "Модератор")
    ).render
    val usersDiv = div().render

    val myDiv = div(
      div(
        nameInput,
        roleSelect,
        button("Добавить", onclick := { () =>
          val name = nameInput.value
          val role = roleSelect.value match {
            case "Admin" => Role.Admin
            case "User" => Role.User
            case "Moderator" => Role.Moderator()
          }
          val newUser = User(name, role)
          users.append(newUser)
          nameInput.value = ""
          usersDiv.innerHTML = ""
          usersDiv.appendChild(
            users.map { user =>
              p(user.toString)
            }.render
          )
        })
      ),
      usersDiv
    ).render

    val appElement = dom.document.getElementById("app")
    appElement.appendChild(myDiv)
  }

}
