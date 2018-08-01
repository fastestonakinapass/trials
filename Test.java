class Test extends Thread
{
	public void run()
	{
		System.out.println("You still suck tho");
	}
	public static void main(String args[])
	{
		System.out.println("Program works fine");
		Test t=new Test();
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		t.start();
	}
}