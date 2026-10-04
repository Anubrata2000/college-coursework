import random

times_of_play = int(input('How many times do you want to play?: '))

user_points = 0
computer_points = 0


for i in range(times_of_play):
  user = input('Enter the input (R/P/S): ').upper()
  comp = random.choice(['R', 'P', 'S'])

  if (user == 'R' and comp == 'S') or (user == 'S' and comp == 'P') or (user == 'P' and comp == 'R'):
    user_points = user_points + 1
    print('--------------------------------------------------------------------')
    print(f'User choose: {user} and Computer choose: {comp}')
    print('User won!!')
    print(f'User Score: {user_points} and Computer Score: {computer_points}')
    print('--------------------------------------------------------------------')
  elif (comp == 'R' and user == 'S') or (comp == 'S' and user == 'P') or (comp == 'P' and user == 'R'):
    computer_points = computer_points + 1
    print('--------------------------------------------------------------------')
    print(f'User choose: {user} and Computer choose: {comp}')
    print('Computer won!!')
    print(f'User Score: {user_points} and Computer Score: {computer_points}')
    print('--------------------------------------------------------------------')
  else:
    print('--------------------------------------------------------------------')
    print(f'User choose: {user} and Computer choose: {comp}')
    print('Match Draw')
    print(f'User Score: {user_points} and Computer Score: {computer_points}')
    print('--------------------------------------------------------------------')


if user_points > computer_points:
  print('--------------------------------------------------------------------')
  print("User won the game!!!!!!")
  print('--------------------------------------------------------------------')
  print(f'Final score : User:{user_points} and Computer:{computer_points}')
  print('--------------------------------------------------------------------')
elif user_points < computer_points:
  print('--------------------------------------------------------------------')
  print("Computer won the game!!!!!!")
  print('--------------------------------------------------------------------')
  print(f'Final score : User:{user_points} and Computer:{computer_points}')
  print('--------------------------------------------------------------------')
else:
  print('--------------------------------------------------------------------')
  print("Match Drawn!!")
  print('--------------------------------------------------------------------')
  print(f'Final score : User:{user_points} and Computer:{computer_points}')
  print('--------------------------------------------------------------------')