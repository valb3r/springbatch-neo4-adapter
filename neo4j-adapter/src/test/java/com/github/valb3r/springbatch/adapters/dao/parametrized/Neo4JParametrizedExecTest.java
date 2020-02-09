package com.github.valb3r.springbatch.adapters.dao.parametrized;

import com.github.valb3r.springbatch.adapters.testconfig.neo4j.Neo4jTestApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Neo4jTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
class Neo4JParametrizedExecTest extends BaseParametrizedDaoBasedExecutionTest {
}
