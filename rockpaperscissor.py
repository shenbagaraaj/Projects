# Hello Guys, Today we start programming with game. 

def rock_paper_scissor(num1,num2,bit1,bit2):
    p1 = (int(num1[bit1])) % 3
    p2 = (int(num2[bit2])) % 3
    
   
    
    if(player_one[p1]==player_two[p2]):
        print("Match Draw ")    
    elif(player_one[p1] == "rock" and player_two[p2] == "paper"):
        print("Congrats, Player two wins")
    elif(player_one[p1] == "paper" and player_two[p2] == "scissor"):
        print("Congrats, Player_two wins")
    elif(player_one[p1]== "scissor" and player_two[p2] == "rock"):
        print("Congrats, Player two wins")
    elif(player_one[p1] == "paper" and player_two[p2] == "rock"):
        print("Congrats, Player one wins")
    elif(player_one[p1] == "scissor" and player_two[p2] == "paper"):
        print("Congrats, Player one wins")
    elif(player_one[p1] == "rock" and player_two[p2] == "scissor"):
        print("Congrats, Player one wins")
    

player_one = {0:"rock",1:"paper",2:"scissor"}
player_two = {0:"rock",1:"paper",2:"scissor"}

while True:
    num1 = input("Player 1, Enter your choice: ")
    num2 = input("Player 2, Enter your choice: ")
    bit1 = int(input("Player one, Enter your secret bit position: "))
    bit2 = int(input("Player two, Enter your secret bit position: "))
    rock_paper_scissor(num1,num2,bit1,bit2)
    choice = input("Do you want to continue? Y OR N ")
    choice.lower()
    if choice == "n":
        break



    
    

