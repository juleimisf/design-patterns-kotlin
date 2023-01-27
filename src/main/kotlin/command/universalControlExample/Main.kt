package command.universalControlExample

fun main() {
    val light = Light()
     val garage = GarageDoor()
     val stereo = Stereo()

     val lightOn = LightOnCommand(light)
     val lightOff = LightOffCommand(light)

     val stereoOn = StereoWithCDCommand(stereo)
     val stereoOff = StereoOffCommand(stereo)

     val garageUp = GarageDoorOpenCommand(garage)
     val garageDown = GarageDoorDownOnCommand(garage)

     val listOfOnCommand = mutableListOf(lightOn, stereoOn, garageUp)
     val listOfOffCommand = mutableListOf(lightOff, stereoOff, garageDown)

     var remoteControl = RemoteControlInvoker(listOfOnCommand, listOfOffCommand)

     remoteControl.setCommand(0, lightOn, lightOff)
     remoteControl.setCommand(1, stereoOn, stereoOff)
     remoteControl.setCommand(2, garageUp, garageDown)

     println(remoteControl.printToString())

     remoteControl.onButtonWasPushed(0)
     remoteControl.offButtonWasPushed(0)
     remoteControl.onButtonWasPushed(1)
     remoteControl.offButtonWasPushed(1)
     remoteControl.onButtonWasPushed(2)
     remoteControl.offButtonWasPushed(2)

}