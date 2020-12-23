package com.kaesar.thread;

import java.util.concurrent.ConcurrentHashMap;

public class ConnectionPool {

  private ConcurrentHashMap<String, Connection> pool = new ConcurrentHashMap<>();

  public Connection getConnection(String key) {
    Connection conn = null;
    if (pool.containsKey(key)) {
      conn = pool.get(key);
    } else {
      conn = createConnection();
      pool.putIfAbsent(key, conn);
    }
    return conn;
  }

  public Connection createConnection() {
    return new Connection();
  }

  class Connection {

  }
}
