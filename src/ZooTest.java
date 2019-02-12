public class ZooTest 
{
	public void constructorTest() throws AssertException
	{
		Zoo zoo = new Zoo(5);
		Assert.assertEquals(5, zoo.getCapacity());
		
	}
	public void expandZooTest() throws AssertException
	{
		Zoo zoo = new Zoo(5);
		zoo.expandZoo();
		Assert.assertEquals(10, zoo.getCapacity());
		
	}
	public void addAnimalTest() throws AssertException
	{
		Animal test = new Animal("Green", "noname", 50.0, 1.5);
		Zoo zoo = new Zoo(1);
		zoo.addAnimal(test);
		Animal[] animals = zoo.getAnimals();
		Animal animal = animals[animals.length-1];
		Assert.assertEquals("noname", animal.getName());
	}
}