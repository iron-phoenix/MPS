class A {
	public List<Class> getDependencies() {
		return Arrays.asList(A.class);
	}
}

class B {
	public List<Class> getDependencies() {
		return Arrays.asList(A.class);
	}
}

class C {
	public List<Class> getDependencies() {
		return Collections.emptyList();
	}
}
