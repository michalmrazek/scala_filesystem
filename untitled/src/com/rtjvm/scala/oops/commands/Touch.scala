package com.rtjvm.scala.oops.commands
import com.rtjvm.scala.oops.files.{DirEntry, File}
import com.rtjvm.scala.oops.filesystem.State

class Touch(name:String) extends CreateEntry(name){

  override def createSpecificEntry(state: State): DirEntry =
    File.empty(state.wd.path, name)

}
