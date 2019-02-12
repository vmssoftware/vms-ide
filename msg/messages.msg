.TITLE SAMPLE$VS Error and Warning Messages
.IDENT "Test ver 1.0"
.page
.FACILITY VVS,33 /prefix=VS_
.SEVERITY ErrOR
UNRECOG <Unrecognized !! keyword !AZ>/FAO_COUNT=1
.LITERAL LASTMSG=VS_UNRECOG
.facility SVS,99 /prefix=SV_
AMBIG <Ambiguous keyword> /Warning
.SEVERITY WARNING
.BASE 10
SYNTAX "Invalid syntax in keyword !AZ" /fao_count=1 /error
.END
