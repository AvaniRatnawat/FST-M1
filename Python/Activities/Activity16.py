# Class car

class Car :
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer+" "+self.model+" is moving")

    def stop(self):
        print(self.manufacturer+" "+self.model+" has stopped")


Jaguar = Car("Jaguar", "J1", 2003, 8, "Black")
BMW = Car("BMW", "C1", 2005, 8, "White")
Tata = Car("Tata", "T1", 2009, 8, "Red")

Jaguar.accelerate()
BMW.stop()
Tata.accelerate()