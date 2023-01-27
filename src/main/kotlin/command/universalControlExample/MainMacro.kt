package command.universalControlExample

fun main() {
    val light = Light()
    val garage = GarageDoor()
    val stereo = Stereo()
    val tv = Tv()

    val lightOn = LightOnCommand(light)
    val lightOff = LightOffCommand(light)

    val stereoOn = StereoWithCDCommand(stereo)
    val stereoOff = StereoOffCommand(stereo)

    val garageUp = GarageDoorOpenCommand(garage)
    val garageDown = GarageDoorDownOnCommand(garage)

    val tvOn = TvOnCommand(tv)
    val tvOff = TvOffCommand(tv)

    val listOfOnCommand = mutableListOf(lightOn, stereoOn, garageUp, tvOn)
    val listOfOffCommand = mutableListOf(lightOff, stereoOff, garageDown, tvOff)

    var remoteControlOnParty = MacroCommand(listOfOnCommand)
    var remoteControlOffParty = MacroCommand(listOfOffCommand)


    var remoteControl = RemoteControlInvoker(listOfOnCommand, listOfOffCommand)

    remoteControl.setCommand(0, remoteControlOnParty, remoteControlOffParty)
    println(remoteControl.printToString())
    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)

}