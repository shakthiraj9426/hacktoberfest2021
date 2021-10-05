from turtle import *
state = {'turn': 0}
# def spinner():
#     clear()
#     angle = state['turn']/10
#     right(angle)
#     forward(100)
#     dot(120, 'red')
#     back(100)
#     right(120)
#     forward(100)
#     dot(120, 'gray')
#     back(100)
#     right(120)
#     forward(100)
#     dot(120, 'violet')
#     back(100)
#     right(120)
#     update()
def fidget():
    clear()
    angle = state['turn']/10
    right(angle)
    forward(100)
    dot(120, 'red')
    back(100)
    right(120)
    forward(100)
    dot(120, 'gray')
    back(100)
    right(120)
    forward(100)
    dot(120, 'violet')
    back(100)
    right(120)
    update()
def animate():
    if state['turn']>0:
        state['turn']-=1

    fidget()
    ontimer(animate, 20)
def flick():
    state['turn']+=10

setup(420, 420, 370, 0)
hideturtle()
tracer(False)
width(60)
onkey(flick, 'space')
listen()
animate()
done()
