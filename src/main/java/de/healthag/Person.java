package de.healthag;

public class Person
{
    private String name;

    private Long year;
    
    private String longString;

    public Person( String name, Long year )
    {
        this(name, year, "4711");
    }
    
    public Person( String name, Long year, String longString )
    {
        super();
        this.name = name;
        this.year = year;
        this.longString = longString;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public Long getYear()
    {
        return year;
    }

    public void setYear( Long year )
    {
        this.year = year;
    }
    
    
  

    public String getLongString()
    {
        return longString;
    }

    public void setLongString( String longString )
    {
        this.longString = longString;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( name == null ) ? 0 : name.hashCode() );
        result = prime * result + ( ( year == null ) ? 0 : year.hashCode() );
        return result;
    }

    @Override
    public boolean equals( Object obj )
    {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        Person other = (Person) obj;
        if ( name == null )
        {
            if ( other.name != null )
                return false;
        }
        else if ( !name.equals( other.name ) )
            return false;
        if ( year == null )
        {
            if ( other.year != null )
                return false;
        }
        else if ( !year.equals( other.year ) )
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "Person [name=" + name + ", year=" + year + "]";
    }

}
