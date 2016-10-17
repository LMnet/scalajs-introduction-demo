package intro

import scala.concurrent.Future

object AsyncDemo {

//  import intro.Main._
//
//  private val predefinedUsers = Seq(
//    User("Thrall", Role.Admin),
//    User("Jaina", Role.User),
//    User("Arthas", Role.Moderator(Set(Permission.AddUser, Permission.ChangeUser))),
//    User("Medivh", Role.Moderator(Set(Permission.DeleteUser))),
//    User("Illidan", Role.Moderator(Set(Permission.AddUser)))
//  )
//
//  trait Action
//  object Action {
//    case object AddUser extends Action
//    case object ChangeUser extends Action
//    case object DeleteUser extends Action
//  }
//
//  val predefinedUsersNames = predefinedUsers.map(_.name)
//
//  def getUserByName(name: String): Future[User] = {
//    Future.successful {
//      predefinedUsers
//        .find(_.name == name)
//        .getOrElse(throw new NoSuchElementException)
//    }
//  }
//
//  def isAbleToDoAction(role: Role, action: Action): Future[Boolean] = {
//    Future.successful {
//      role match {
//        case Role.Admin => true
//        case Role.User => false
//        case Role.Moderator(permissions) =>
//          action match {
//            case Action.AddUser => permissions.contains(Permission.AddUser)
//            case Action.ChangeUser => permissions.contains(Permission.ChangeUser)
//            case Action.DeleteUser => permissions.contains(Permission.DeleteUser)
//          }
//      }
//    }
//  }
}
