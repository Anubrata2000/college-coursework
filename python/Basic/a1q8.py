print("Total population of a town is 80000")
totalpopulation=80000
literacypeople=0.48*totalpopulation
print("Total percentage of people literacy is 48% which is",literacypeople,"of the total population")
literatemen=0.35*totalpopulation
men=0.52*totalpopulation
print("Total men in town",men)
women=totalpopulation-men
print("Total women in town",women)
print("Total literate men is 35% of total population which is",literatemen)
literatewomen=literacypeople-literatemen
print("Total literate women is",literatewomen)
illeteratemen=men-literatemen
print("Total number of illeterate men is",illeteratemen)
illeteratewomen=women-literatewomen
print("Total illeterate women",illeteratewomen)