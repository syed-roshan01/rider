.class public abstract Ly1/t;
.super Ljava/lang/Object;


# static fields
.field public static final synthetic a:[Lj9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x16

    new-array v0, v0, [Lj9/f;

    new-instance v1, Ld9/l;

    const-string v2, "stateDescription"

    const-string v3, "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Ld9/v;->a:Ld9/w;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "progressBarRangeInfo"

    const-string v3, "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "paneTitle"

    const-string v3, "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "liveRegion"

    const-string v3, "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "focused"

    const-string v3, "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "isContainer"

    const-string v3, "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x5

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "isTraversalGroup"

    const-string v3, "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x6

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "traversalIndex"

    const-string v3, "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x7

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "horizontalScrollAxisRange"

    const-string v3, "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x8

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "verticalScrollAxisRange"

    const-string v3, "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x9

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "role"

    const-string v3, "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xa

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "testTag"

    const-string v3, "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xb

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "textSubstitution"

    const-string v3, "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xc

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "isShowingTextSubstitution"

    const-string v3, "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xd

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "editableText"

    const-string v3, "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xe

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "textSelectionRange"

    const-string v3, "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xf

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "imeAction"

    const-string v3, "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x10

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "selected"

    const-string v3, "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x11

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "collectionInfo"

    const-string v3, "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x12

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "collectionItemInfo"

    const-string v3, "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x13

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "toggleableState"

    const-string v3, "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x14

    aput-object v1, v0, v2

    new-instance v1, Ld9/l;

    const-string v2, "customActions"

    const-string v3, "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;"

    invoke-direct {v1, v2, v3}, Ld9/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sput-object v0, Ly1/t;->a:[Lj9/f;

    sget-object v0, Ly1/r;->a:Ly1/u;

    sget-object v0, Ly1/i;->a:Ly1/u;

    return-void
.end method

.method public static final a(Ljava/lang/String;)Ly1/u;
    .locals 1

    new-instance v0, Ly1/u;

    invoke-direct {v0, p0}, Ly1/u;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x1

    iput-boolean p0, v0, Ly1/u;->c:Z

    return-object v0
.end method

.method public static final b(Ljava/lang/String;Ly1/q;)Ly1/u;
    .locals 2

    new-instance v0, Ly1/u;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1, p1}, Ly1/u;-><init>(Ljava/lang/String;ZLy1/q;)V

    return-object v0
.end method

.method public static c(Ly1/v;Lc9/c;)V
    .locals 3

    sget-object v0, Ly1/i;->a:Ly1/u;

    new-instance v1, Ly1/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    check-cast p0, Ly1/j;

    invoke-virtual {p0, v0, v1}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Ly1/v;I)V
    .locals 3

    sget-object v0, Ly1/r;->s:Ly1/u;

    sget-object v1, Ly1/t;->a:[Lj9/f;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    new-instance v1, Ly1/g;

    invoke-direct {v1, p1}, Ly1/g;-><init>(I)V

    invoke-virtual {v0, p0, v1}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    return-void
.end method
