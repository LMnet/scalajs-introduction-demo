package intro

import org.scalajs.dom

import scala.collection.mutable
import scala.scalajs.concurrent.JSExecutionContext.Implicits.queue
import scala.util.{Failure, Success}

object AsyncExample {

//  case class User(name: String, role: Role)
//
//  trait Role
//  object Role {
//    case object Admin extends Role
//    case object User extends Role
//    case class Moderator(permissions: Set[Permission] = Set.empty) extends Role
//  }
//
//  trait Permission
//  object Permission {
//    case object AddUser extends Permission
//    case object ChangeUser extends Permission
//    case object DeleteUser extends Permission
//  }
//
//  def main(): Unit = {
//
//    import scalatags.JsDom.all._
//
//    val users = mutable.Buffer.empty[User]
//
//    val nameInput = input(`type` := "text", placeholder := "Имя").render
//    val roleSelect = select(
//      option(value := "Admin", "Админ"),
//      option(value := "User", "Пользователь"),
//      option(value := "Moderator", "Модератор")
//    ).render
//    val usersDiv = div().render
//
//    val executorSelect = select(
//      AsyncDemo.predefinedUsersNames.map { userName =>
//        option(value := userName, userName)
//      }
//    ).render
//
//    val myDiv = div(
//      div(
//        executorSelect,
//        nameInput,
//        roleSelect,
//        button("Добавить", onclick := { () =>
//          val name = nameInput.value
//          val role = roleSelect.value match {
//            case "Admin" => Role.Admin
//            case "User" => Role.User
//            case "Moderator" => Role.Moderator()
//          }
//
//          val addUserAsync = for {
//            executor <- AsyncDemo.getUserByName(executorSelect.value)
//            isAble <- AsyncDemo.isAbleToDoAction(executor.role, AsyncDemo.Action.AddUser)
//          } yield {
//            if (isAble) {
//              Some(User(name, role))
//            } else {
//              None
//            }
//          }
//
//          addUserAsync.onComplete {
//            case Success(Some(newUser)) =>
//              users.append(newUser)
//              nameInput.value = ""
//              usersDiv.innerHTML = ""
//              usersDiv.appendChild(
//                users.map { user =>
//                  p(user.toString)
//                }.render
//              )
//            case Success(None) =>
//              dom.window.alert("У вас не хватает прав для этого действия!")
//            case Failure(e) =>
//              dom.window.alert(e.toString)
//          }
//        })
//      ),
//      usersDiv
//    ).render
//
//    val appElement = dom.document.getElementById("app")
//    appElement.appendChild(myDiv)
//  }

}
