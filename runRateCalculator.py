def Solution():
    print("Welcome to Run rate Calculator.")
    target = int(input("Enter the target score: "))
    total_no_of_overs = int(input("Enter the total number of overs: "))
    choice = input("Is the innings started? (Yes / No) ")
    if choice.lower() == "yes":
        currentOver = int(input("Enter the current Over: "))
        result = int(target/(total_no_of_overs - currentOver))
        print("The Required Run Rate is ",result)
    elif choice.lower() == "no":
        result = int(target/total_no_of_overs)
        print("The Required Run Rate is", result)

Solution()
