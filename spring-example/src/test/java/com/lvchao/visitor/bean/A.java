package com.lvchao.visitor.bean;

import com.lvchao.visitor.util.VisitorAnno;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j(topic = "e")
@Component
@VisitorAnno
public class A implements C{
}
