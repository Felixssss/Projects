package com.gem.util;

import java.sql.ResultSet;
import java.util.List;

public interface IParseRs<T> {
    public List<T> parseRs(ResultSet rs);
}
