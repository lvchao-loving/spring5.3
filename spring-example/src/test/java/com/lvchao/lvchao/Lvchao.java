package com.lvchao.lvchao;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/11/28 23:10
 */
@Slf4j
@Data
public class Lvchao {

	private String name;
	private Integer age;

	public Lvchao() {
		log.info("Lvchao class 的无参构造函数");
	}
}

@Slf4j
@Data
class Lvchao1 extends Lvchao{

	private String name1;
	private Integer age1;

	public Lvchao1() {
		log.info("Lvchao1 class 的无参构造函数");
	}

	public Lvchao1(String name1, Integer age1) {
		this();
		this.name1 = name1;
		this.age1 = age1;
	}

	public static void main(String[] args) {

		Lvchao1 lvchao1 = new Lvchao1("lvchao1", 23);

	}
}
