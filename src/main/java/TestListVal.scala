object TestListVal {
  def main(array: Array[String]): Unit = {
      val list : List[Any] = List(
        "a string",
        123,
        'c',
        true,
        () => "an anonymous function returning a string"
      )
//    list = List(1,2,3)
    println(list)
  }
}