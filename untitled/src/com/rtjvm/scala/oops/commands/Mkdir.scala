package com.rtjvm.scala.oops.commands

import com.rtjvm.scala.oops.files.{DirEntry, Directory}
import com.rtjvm.scala.oops.filesystem.State

class Mkdir(name: String) extends CreateEntry(name) {
  override def createSpecificEntry(state: State): DirEntry =
    Directory.empty(state.wd.path,name)

}
