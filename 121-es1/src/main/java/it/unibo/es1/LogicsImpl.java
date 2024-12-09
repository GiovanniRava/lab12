package it.unibo.es1;

import java.util.ArrayList;
import java.util.List;

public class LogicsImpl implements Logics {
	private final int size;
	public LogicsImpl(int size) {
		this.size=size;
	}

	@Override
	public int size() {
		return size;	
	}

	@Override
	public List<Integer> values() {
		final List<Integer> list =new ArrayList<>();
		for (int i=0;i<=this.size;i++){
			list.add(i);
		}
		return list;
	}


	@Override
	public List<Boolean> enablings() {
		final List<Boolean> list = new ArrayList<>();
		for (Jbutton butt : jbs) {
			
		}
	}

	@Override
	public int hit(int elem) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'hit'");
	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'result'");
	}

	@Override
	public boolean toQuit() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'toQuit'");
	}
}
