CREATE TABLE STUDENT (
  StudentID     int             NOT NULL,
  Title         varchar(5)      NOT NULL DEFAULT 'M.',
  FirstName     varchar(50)     NOT NULL,
  MiddleName    varchar(50)     NOT NULL,
  LastName      varchar(50)     NOT NULL,
  Address       varchar(50)     NULL,
  Zip           char(5)         NOT NULL,
  PhoneNumber   varchar(15)     NULL,
  Major         varchar(50)     NULL,
  CONSTRAINT StudentPK          PRIMARY KEY (StudentID),
  CONSTRAINT TitleCheck         CHECK(Title in 'M.', 'Mr.', 'Miss.', 'Mrs.', 'Dr.'),
  CONSTRAINT ZipPK              PRIMARY KEY (ZipCode),
  REFERENCES ZipCode(Zip),
  ON UPDATE NO ACTION,
  ON DELETE NO ACTION
);

CREATE TABLE ZIPCODE (
  Zip           char(5)         NOT NULL,
  City          char(20)        NOT NULL,
  State         char(2)         NOT NULL,
  CONSTRAINT ZipPK              PRIMARY KEY (ZipCode),
  CONSTRAINT UniqueCityState    UNIQUE (State, City)
);

CREATE TABLE COURSE (
  Term          Number(6)       NOT NULL,
  CRN           varchar(10)     NOT NULL,
  Code          int(10)         NULL,
  Number        int(10)         NULL,
  Section       int(5)          NULL,
  Level         char(1)         NULL,
  Hours         int             NULL,
  Days          char(6)         NULL,
  Room          char(5)         NULL,
  Time          time            NULL,
  CONSTRAINT  CRNPK PRIMARY KEY(TERM, CRN),
  CONSTRAINT  CHECK   (Level in ('U', 'G', 'B'))
);

CREATE TABLE REGISTRATION_FORM (
  StudentID     int(10)         NOT NULL,
  Term          varchar(6)      NOT NULL,
  CRN           varchar(10)     NOT NULL,
  Date          date            NOT NULL,
  GradeType     varchar(10)     NOT NULL,
  Status        varchar(2)      NOT NULL,
  PreReg        bool            NOT NULL,
  TotalCredits  int             NOT NULL,
  CONSTRAINT StuPk PRIMARY KEY (StudentID, CRN, Term),
  CONSTRAINT StatusCheck CHECK (Status in ('A', 'D', 'V')),
  CONSTRAINT StuFk FOREIGN KEY (StudentID)
);
