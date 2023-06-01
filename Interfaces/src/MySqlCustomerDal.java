
public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepostory{

	@Override
	public void Add() {
		System.out.println("My sql eklendi");
		
	}

}
