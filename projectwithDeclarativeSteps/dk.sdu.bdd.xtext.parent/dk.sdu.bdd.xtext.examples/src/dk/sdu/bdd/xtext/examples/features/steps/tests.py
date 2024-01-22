from behave import when, given, then
import time
import environment as env #modif
import os

#File created by the developer and utilizing methods form the ur_rtde library imported using "env"

@then('the position {prep} the robot "{identifier}" is "{position}"')
@given('the position {prep} the robot "{identifier}" is "{position}"')
def step_given(context, identifier : str, position, prep):
     
    text =  context.robot_name + " is now at " + position + ".\n" +" Which means : " + str(context.bob.pos())
    env.writeText4user(context, text, context.text4userPos)
  
@when('the robot "{identifier}" stands_still to position "{position}"') 
def step_when(context, identifier : str, position):
    text =  context.robot_name + " is now at " + position + ".\n" +" Which means : " + str(context.bob.pos())
    env.writeText4user(context, text, context.text4userPos)


@when('the robot "{identifier}" moves to position "{position}" with "{speed}" speed')
def step_when(context, identifier : str, position, speed : str):
    env.move(context, position, speed)


@then('the figure "{identifier}" is {state}')
@given('the figure "{identifier}" is {state}')
def step_impl(context, identifier:str, state):
    
    if(state == "filled"):
        env.writeText4user(context, "Well done, what a beautiful square !", context.text4userPos)
        
    elif(state == "three_quarters_full"):
        env.writeText4user(context, "We are almost done, last step !", context.text4userPos)
        
    elif(state == "half_full"):
        env.writeText4user(context, "We are half way to have our complete square !", context.text4userPos)
    
    elif(state == "quarter_filled"):
        env.writeText4user(context, "The square is beginning to take shape!", context.text4userPos)
        


