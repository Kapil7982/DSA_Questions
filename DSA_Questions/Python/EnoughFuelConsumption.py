def enoughFuelConsumption(fuel, distance):
    required = fuel * distance
    if required > 50:
        print("Enough")
    else:
        print("Go On")


enoughFuelConsumption(1, 46)
