.class public final Lc1/k;
.super Ljava/lang/Object;


# static fields
.field public static final b:Lc1/k;

.field public static final c:Lc1/k;


# instance fields
.field public final a:Lo0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc1/k;

    invoke-direct {v0}, Lc1/k;-><init>()V

    sput-object v0, Lc1/k;->b:Lc1/k;

    new-instance v0, Lc1/k;

    invoke-direct {v0}, Lc1/k;-><init>()V

    sput-object v0, Lc1/k;->c:Lc1/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo0/i;

    const/16 v1, 0x10

    new-array v1, v1, [Lc1/l;

    invoke-direct {v0, v1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lc1/k;->a:Lo0/i;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 14

    sget-object v0, Lc1/k;->b:Lc1/k;

    const-string v1, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    if-eq p0, v0, :cond_12

    sget-object v0, Lc1/k;->c:Lc1/k;

    if-eq p0, v0, :cond_11

    iget-object v0, p0, Lc1/k;->a:Lo0/i;

    invoke-virtual {v0}, Lo0/i;->l()Z

    move-result v1

    if-eqz v1, :cond_10

    iget v1, v0, Lo0/i;->c:I

    const/4 v2, 0x0

    if-lez v1, :cond_f

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    move v3, v2

    move v4, v3

    :cond_0
    aget-object v5, v0, v3

    check-cast v5, Lc1/l;

    check-cast v5, Ly0/n;

    iget-object v5, v5, Ly0/n;->a:Ly0/n;

    iget-boolean v6, v5, Ly0/n;->t:Z

    if-eqz v6, :cond_e

    new-instance v6, Lo0/i;

    const/16 v7, 0x10

    new-array v8, v7, [Ly0/n;

    invoke-direct {v6, v8}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iget-object v8, v5, Ly0/n;->f:Ly0/n;

    if-nez v8, :cond_1

    invoke-static {v6, v5}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v6, v8}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    invoke-virtual {v6}, Lo0/i;->l()Z

    move-result v5

    if-eqz v5, :cond_d

    iget v5, v6, Lo0/i;->c:I

    const/4 v8, 0x1

    sub-int/2addr v5, v8

    invoke-virtual {v6, v5}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly0/n;

    iget v9, v5, Ly0/n;->d:I

    and-int/lit16 v9, v9, 0x400

    if-nez v9, :cond_3

    invoke-static {v6, v5}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v5, :cond_2

    iget v9, v5, Ly0/n;->c:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_c

    const/4 v9, 0x0

    move-object v10, v9

    :goto_2
    if-eqz v5, :cond_2

    instance-of v11, v5, Lc1/p;

    if-eqz v11, :cond_5

    check-cast v5, Lc1/p;

    invoke-virtual {v5}, Lc1/p;->G0()Lc1/i;

    move-result-object v11

    iget-boolean v11, v11, Lc1/i;->a:Z

    if-eqz v11, :cond_4

    invoke-static {v5}, Landroidx/compose/ui/focus/a;->C(Lc1/p;)Z

    move-result v5

    goto :goto_3

    :cond_4
    sget-object v11, Lc1/g;->d:Lc1/g;

    const/4 v12, 0x7

    invoke-static {v5, v12, v11}, Landroidx/compose/ui/focus/a;->h(Lc1/p;ILc9/c;)Z

    move-result v5

    :goto_3
    if-eqz v5, :cond_b

    move v4, v8

    goto :goto_6

    :cond_5
    iget v11, v5, Ly0/n;->c:I

    and-int/lit16 v11, v11, 0x400

    if-eqz v11, :cond_b

    instance-of v11, v5, Lt1/o;

    if-eqz v11, :cond_b

    move-object v11, v5

    check-cast v11, Lt1/o;

    iget-object v11, v11, Lt1/o;->v:Ly0/n;

    move v12, v2

    :goto_4
    if-eqz v11, :cond_a

    iget v13, v11, Ly0/n;->c:I

    and-int/lit16 v13, v13, 0x400

    if-eqz v13, :cond_9

    add-int/lit8 v12, v12, 0x1

    if-ne v12, v8, :cond_6

    move-object v5, v11

    goto :goto_5

    :cond_6
    if-nez v10, :cond_7

    new-instance v10, Lo0/i;

    new-array v13, v7, [Ly0/n;

    invoke-direct {v10, v13}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz v5, :cond_8

    invoke-virtual {v10, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v5, v9

    :cond_8
    invoke-virtual {v10, v11}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_9
    :goto_5
    iget-object v11, v11, Ly0/n;->f:Ly0/n;

    goto :goto_4

    :cond_a
    if-ne v12, v8, :cond_b

    goto :goto_2

    :cond_b
    invoke-static {v10}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v5

    goto :goto_2

    :cond_c
    iget-object v5, v5, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :cond_d
    :goto_6
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_0

    move v2, v4

    goto :goto_7

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "visitChildren called on an unattached node"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    :goto_7
    return v2

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
