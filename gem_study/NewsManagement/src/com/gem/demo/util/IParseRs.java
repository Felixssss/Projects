package com.gem.demo.util;

import java.sql.ResultSet;
import java.util.List;

public interface IParseRs<T> {
    public List<T> parseRS(ResultSet rs);
}
