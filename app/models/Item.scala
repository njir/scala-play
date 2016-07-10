/**
  * Created by tak on 16. 7. 10.
  */

package models

case class Item (
  idItem : Option[Int],
  name: String,
  damage: Option[Int],
  armor: Option[Int]
)

