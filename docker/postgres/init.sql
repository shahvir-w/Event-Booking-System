DO $$ BEGIN
    CREATE DATABASE ticketing;
EXCEPTION
    WHEN duplicate_database THEN
        NULL;
END $$;