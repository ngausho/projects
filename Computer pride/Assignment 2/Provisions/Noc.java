/**
 * Noc.java
 * 
 * KIT107 Assignment 2 -- NOC Implementation
 * 
 * @author <<your name and student ID number>>
 * @version	<<date of completion>>
 */


public class Noc implements NocInterface
{
    // instance variable declarations
    
	/**
	 * Constructor
	 * 
	 * Precondition: None
	 * Postcondition: The new instance will have its instance variable(s)
     *                  initialised with the relevant parameters.
	 * Informally: Initialise the collection of athletes.
	 */
    public Noc()
    {

    }

	/**
	 * isEmpty()
	 * 
	 * @return boolean -- whether the collection is empty
	 * 
	 * Precondition: None
	 * Postcondition: True is returned if the collection is empty; false is
     *                  returned otherwise.
	 * Informally: Check whether the collection is empty.
	 */
    public boolean isEmpty()
    {

    }

    /**
	 * getYear()
	 * 
	 * @return int -- the year of competition for all athletes in this cluster
     *                  or 0 if the cluster is empty
	 * 
	 * Precondition: None
	 * Postcondition: the year of the first athlete in the cluster -- or 0 if
     *                  it is empty -- is returned.
	 * Informally: Get the year of competition for the current Games.
	 */
    public int getYear()
    {

    }

    /**
	 * getCity()
	 * 
	 * @return String -- the location (city) of competition for this cluster
     *                  or "" if the cluster is empty
	 * 
	 * Precondition: None
	 * Postcondition: the city of the first athlete in the cluster -- or "" if
     *                  it is empty -- is returned.
	 * Informally: Get the city of competition for the current Games.
	 */
    public String getCity()
    {

    }

    /**
	 * addAthleteToNOC()
	 * 
	 * @param a Athlete -- the athlete to add to this cluster
	 * 
	 * Precondition: The given Athlete parameter has been constructed
	 * Postcondition: The given Athlete has been added to the cluster of
     *                  athletes preserving the order by name and maintaining
     *                  alphabetical order of NOC.
	 * Informally: Add an athlete to an Olympic Games in order of NOC and
     *                  athlete name.
	 */
    public void addAthleteToNOC(Athlete a)
    {

    }

    /**
	 * getGoldCount()
	 * 
	 * @param noc String -- the NOC to count the gold medals for
     * 
     * @return int -- the number of gold medals for the given NOC
	 * 
	 * Precondition: The given NOC parameter is not null
	 * Postcondition: The cluster is searched for athletes from the given NOC
     *                  who received gold medals and the count of these is
     *                  returned.
	 * Informally: Count the number of athletes from a given NOC in the
     *                  current Olympic Games who received gold medals.
	 */
    public int getGoldCount(String noc)
    {

    }

    /**
	 * getWinningNOC()
	 * 
	 * @return String -- the NOC with the largest number of gold medals in
     *                      the crrent Olympic Games
	 * 
	 * Precondition: None
	 * Postcondition: A count is made of the number of gold medalists in each
     *                  NOC with the name and number of the most awarded NOC
     *                  remembered and the winning NOC returned.  If the
     *                  cluster is empty then "" is returned, and, in the case
     *                  of a tie, the NOC alphabetically later is returned.
	 * Informally: Count the number of athletes from every NOC in the current
     *                  Olympic Games who received gold medals and return the
     *                  NOC receiving the most.
	 */
    public String getWinningNOC()
    {
        
    }

    /**
	 * showMedalTally()
	 * 
	 * Precondition: None
	 * Postcondition: The medal table for the current Olympic Games is printed.
	 * Informally: Produce a tally of medals by NOC for the current cluster.
	 */
    public void showMedalTally()
    {

    }

	/**
	 * toString()
	 * 
	 * @return String -- printable form of the cluster of athletes
	 * 
	 * Precondition: None
	 * Postcondition: A printable (String) form of the athletes' data is
     *                  returned, one athlete per line.  If there are no
     *                  athletes then "" is returned.
	 * Informally: Convert the cluster of athletes' data to a multi-line
     *                  String.
	 */
    public String toString()
    {

    }
}