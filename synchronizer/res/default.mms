! MMS
! try -> $(WILDCART *.h)
TargetName = project
BuildType = debug
Output = .OUT.$(BuidlType)
Objects = $(Output).obj
&([Output]TargetName).exe DEPENDS_ON $(Objects)TargetName.obj
    link
