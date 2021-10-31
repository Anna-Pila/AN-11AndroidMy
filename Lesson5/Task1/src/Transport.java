abstract  class Transport {
    int power;
    double maxSpeed;
    double weight;
    String brand;

    Transport(int power, double maxSpeed,double weight,String brand){
        this.brand = brand;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;

    }
    public double powerKilowatt(){
        return power * 0.74;
    }

    public void print(){
        System.out.print("Марка: "+brand+"\nМощность: "+power+
                "л\nМаксимальная скорость: "+maxSpeed+"\nМасса: "+weight
                +"\nМощность в киловатах: "+powerKilowatt()+"\n");
    }


}

