def firstRoom():
    directions = ["left","right","forward","backward"]
    print("You are in the middle room now , you need to find an Exit path and avoid Dead Ends")
    print("You are at a crossroads, and you can choose to go down any of the four hallways. Where would you like to go?")
    choosenDirection = ""
    while choosenDirection not in directions:
        print("Options: left/right/backward/forward")
        choosenDirection = input()
        if choosenDirection == "left":
            # call function for next room 
        elif choosenDirection == "right":
            # call function for next room 
        elif choosenDirection == "forward":
            # call function for next room 
        elif choosenDirection == "backward":
            # call function for next room 
        else: 
            # call function for next room 




if __name__ == "__main__":
    while True:
        print("Welcome to the Adventure Game!")
        print("As an avid traveler, you have decided to visit the Catacombs of Paris.")
        print("However, during your exploration, you find yourself lost.")
        print("You can choose to walk in multiple directions to find a way out.")
        print("Let's start with your name: ")
        name = input()
        print("Good luck, " +name+ ".")
        firstRoom()

