package com.rtjvm.scala.oops.filesystem

import com.rtjvm.scala.oops.commands.Command
import com.rtjvm.scala.oops.files.Directory

import java.util.Scanner

object Filesystem extends App {

  val root = Directory.ROOT
  var state = State(root, root)
  val scanner = new Scanner(System.in)

  while(true) {
    state.show
    val input =  scanner.nextLine()
    state = Command.from(input).apply(state)
  }
}
