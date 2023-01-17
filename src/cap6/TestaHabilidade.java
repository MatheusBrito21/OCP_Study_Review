package cap6;

public class TestaHabilidade implements Habilidades {
	@Override
	public boolean podeNadar(Animal a) {
		return a.isCanSwim();
	}
	@Override
	public boolean podeVoar(Animal a) {
		return a.isCanFly();
	}
}
