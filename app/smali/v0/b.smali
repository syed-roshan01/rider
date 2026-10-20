.class public final Lv0/b;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:Lv0/d;

.field public final synthetic b:Lv0/p;

.field public final synthetic c:Lv0/l;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lv0/d;Lv0/p;Lv0/l;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lv0/b;->a:Lv0/d;

    iput-object p2, p0, Lv0/b;->b:Lv0/p;

    iput-object p3, p0, Lv0/b;->c:Lv0/l;

    iput-object p4, p0, Lv0/b;->d:Ljava/lang/String;

    iput-object p5, p0, Lv0/b;->e:Ljava/lang/Object;

    iput-object p6, p0, Lv0/b;->f:[Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lv0/b;->a:Lv0/d;

    iget-object v1, v0, Lv0/d;->b:Lv0/l;

    iget-object v2, p0, Lv0/b;->c:Lv0/l;

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    iput-object v2, v0, Lv0/d;->b:Lv0/l;

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, v0, Lv0/d;->c:Ljava/lang/String;

    iget-object v4, p0, Lv0/b;->d:Ljava/lang/String;

    invoke-static {v2, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iput-object v4, v0, Lv0/d;->c:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    iget-object v1, p0, Lv0/b;->b:Lv0/p;

    iput-object v1, v0, Lv0/d;->a:Lv0/p;

    iget-object v1, p0, Lv0/b;->e:Ljava/lang/Object;

    iput-object v1, v0, Lv0/d;->d:Ljava/lang/Object;

    iget-object v1, p0, Lv0/b;->f:[Ljava/lang/Object;

    iput-object v1, v0, Lv0/d;->e:[Ljava/lang/Object;

    iget-object v1, v0, Lv0/d;->f:Lv0/m;

    if-eqz v1, :cond_2

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lv0/m;->a()V

    const/4 v1, 0x0

    iput-object v1, v0, Lv0/d;->f:Lv0/m;

    invoke-virtual {v0}, Lv0/d;->c()V

    :cond_2
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0
.end method
