package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float f = this.getValue() * (float)1.8 + (float)32.0;
        return new Fahrenheit(f);
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + this.getValue() + " C";
    }
}
