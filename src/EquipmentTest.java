public class EquipmentTest
{
	public void constructorTest() throws AssertException
	{
		Equipment equipment = new Equipment("Batarang/5, 5, 5, A boomerang for bats");
		Assert.assertEquals("Batarang", equipment.getName());
		Assert.assertEquals(5, equipment.getCount());
		Assert.assertEquals(5.0, equipment.getTotalPrice());
		Assert.assertEquals(5.0, equipment.getTotalWeight());
		Assert.assertEquals(" A boomerang for bats", equipment.getDescription());
	}
}