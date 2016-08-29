/*模板方法设计模式，在类中不确定的部分暴露出去让子类实现*/
abstract class GetTime {

	public final void getTime(int[] array) {
		long before = System.currentTimeMillis();
		runCode(array);
		long after = System.currentTimeMillis();
		System.out.println(after - before);
	}

	public abstract void runCode(int array[]);// 反正也不用，直接抽象。抽象方法不用写大括号
}