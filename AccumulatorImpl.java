package MetaPack;

public class AccumulatorImpl implements Accumulator{
	private int total;
	
	public AccumulatorImpl() {
		this.total = 0;
	}
	
	@Override
	public int accumulate(int... values) {
		int result = 0;
		for(int i: values) {
			result += i;
		}
		total += result;
		return result;
	}

	@Override
	public int getTotal() {
		return total;
	}

	@Override
	public void reset() {
		total = 0;
	}
}
