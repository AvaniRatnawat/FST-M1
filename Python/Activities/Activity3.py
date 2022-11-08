player1 = input("Enter name of 1st player")
player2 = input("Enter name of 2nd player")

player1_choice = input("Enter choice of 1st player - Rock/Paper/Scissors ?").lower()
player2_choice = input("Enter choice of 2nd player - Rock/Paper/Scissors ?").lower()

if player1_choice == player2_choice:
    print("It's a tie!")
elif player1_choice == "rock":
    if player2_choice == "scissors":
        print("Player_1 wins")
    else:
        print("Player_2 wins")

elif player1_choice == "scissors":
    if player2_choice == "paper":
        print("Player_1 wins")
    else:
        print("Player_2 wins")

elif player1_choice == "paper":
    if player2_choice == "rock":
        print("Player_1 wins")
    else:
        print("Player_2 wins")

else:
    print("Invalid input! You have not entered rock, paper or scissors. Try again!")







