class A {
	public List<Class> getDependencies() {
		return Arrays.asList(A.class);
	}
}

class B {
	public List<Class> getDependencies() {
		return Arrays.asList(A.class, B.class);
	}
}

class C {
	public List<Class> getDependencies() {
		return Collections.emptyList();
	}
}

class D {
	public List<Class> getDependencies() {
		return Arrays.asList(B.class);
	}
}

class E {
	public List<Class> getDependencies() {
		return Arrays.asList(A.class, B.class, D.class);
	}
}
