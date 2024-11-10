package com.javatpoint.sample;

import java.util.Objects;

public class GetterSetterExample {
String s1;
String s2;
@Override
public int hashCode() {
	return Objects.hash(s1, s2);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	GetterSetterExample other = (GetterSetterExample) obj;
	return Objects.equals(s1, other.s1) && Objects.equals(s2, other.s2);
}

}
