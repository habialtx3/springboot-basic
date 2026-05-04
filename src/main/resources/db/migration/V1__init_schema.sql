CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE transactions (
                              id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                              reference VARCHAR(50) NOT NULL UNIQUE,
                              amount BIGINT NOT NULL,
                              status VARCHAR(10) NOT NULL,
                              created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                              updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE users (
                       id         UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                       username   VARCHAR(50)  NOT NULL UNIQUE,
                       password   VARCHAR(255) NOT NULL,
                       created_at TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);


CREATE UNIQUE INDEX ux_transactions_reference
    ON transactions(reference);