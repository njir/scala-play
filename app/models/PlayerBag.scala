/**
  * Created by tak on 16. 7. 10.
  */

package models

case class PlayerBag (
  idPlayer: Int,
  name: String,
  level: Int,
  items: List[Item]
)

