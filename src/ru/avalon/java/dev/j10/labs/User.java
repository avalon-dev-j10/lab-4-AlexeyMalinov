package ru.avalon.java.dev.j10.labs;

import java.util.Date;

public class User implements Person {

    private final String name;
    private final Date birthday;

    public User(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    public Date getBirthDate() {
        return birthday;
    }

    /**
     * {@inheritDoc}
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        if (!(o instanceof User)) {
            return 1;
        } else if (name.compareTo(((User) o).name) > 0) {
            return 1;
        } else if (name.compareTo(((User) o).name) < 0) {
            return -1;
        } else if (birthday.compareTo(((User) o).birthday) > 0) {
            return 1;
        } else if (birthday.compareTo(((User) o).birthday) < 0) {
            return -1;
        }
        return 0;
    }
}

