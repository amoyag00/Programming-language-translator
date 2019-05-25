package procesadores;

public class Main {
	int $a = 0;
	int $b = 0;

	public static void main(String[] args) {
		Main main = new Main();
		main.$main();
	}

	public void $main() {
		int $i = 0;
		$a = 3;
		$b = 2;
		$i = $a - $b;
		return;
	}

	public int $prueba1() {
		int $i = 0;
		$a = 2;
		$b = 3;
		$i = $a - $b;
		return $i;
	}

	public int $prueba2() {
		int $i = 0;
		$i = 2 - 3;
		return $i;
	}

	public int $prueba3() {
		int $i = 0;
		$a = 2;
		$b = -3;
		$i = $a - $b;
		return $i;
	}

	public int $prueba4() {
		int $i = 0;
		$b = 2;
		$i = 1 - (2 - 3);
		return $i;
	}

	public int $prueba5() {
		int $i = 0;
		$i = 2;
		$i = $i + 3;
		return $i;
	}

	public int $prueba6() {
		int $i = 0;
		$i = 2;
		$i = $i - 3;
		return $i;
	}

	public double $prueba7() {
		double $i = 0.0;
		$i = 2;
		$i = $i - 3.3;
		return $i;
	}

	public double $prueba8() {
		double $i = 0.0;
		$i = 3.3 - 2.2;
		return $i;
	}

}