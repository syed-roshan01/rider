.class public final Lu/p2;
.super Ljava/lang/Object;

# interfaces
.implements Lv/f2;


# static fields
.field public static final i:Lv0/p;


# instance fields
.field public final a:Lm0/l1;

.field public final b:Lm0/l1;

.field public final c:Lx/m;

.field public final d:Lm0/l1;

.field public e:F

.field public final f:Lv/y;

.field public final g:Lm0/j0;

.field public final h:Lm0/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lu/o2;->a:Lu/o2;

    sget-object v1, Lu/r;->f:Lu/r;

    sget-object v2, Lv0/q;->a:Lv0/p;

    new-instance v2, Lv0/p;

    invoke-direct {v2, v0, v1}, Lv0/p;-><init>(Lc9/e;Lc9/c;)V

    sput-object v2, Lu/p2;->i:Lv0/p;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object p1

    iput-object p1, p0, Lu/p2;->a:Lm0/l1;

    const/4 p1, 0x0

    invoke-static {p1}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object p1

    iput-object p1, p0, Lu/p2;->b:Lm0/l1;

    new-instance p1, Lx/m;

    invoke-direct {p1}, Lx/m;-><init>()V

    iput-object p1, p0, Lu/p2;->c:Lx/m;

    const p1, 0x7fffffff

    invoke-static {p1}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object p1

    iput-object p1, p0, Lu/p2;->d:Lm0/l1;

    new-instance p1, Lq/w;

    const/16 v0, 0x8

    invoke-direct {p1, p0, v0}, Lq/w;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lv/y;

    invoke-direct {v0, p1}, Lv/y;-><init>(Lc9/c;)V

    iput-object v0, p0, Lu/p2;->f:Lv/y;

    new-instance p1, Lu/m2;

    const/4 v0, 0x3

    invoke-direct {p1, p0, v0}, Lu/m2;-><init>(Lu/p2;I)V

    invoke-static {p1}, Ld7/t;->R(Lc9/a;)Lm0/j0;

    move-result-object p1

    iput-object p1, p0, Lu/p2;->g:Lm0/j0;

    new-instance p1, Lu/m2;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lu/m2;-><init>(Lu/p2;I)V

    invoke-static {p1}, Ld7/t;->R(Lc9/a;)Lm0/j0;

    move-result-object p1

    iput-object p1, p0, Lu/p2;->h:Lm0/j0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lu/p2;->h:Lm0/j0;

    invoke-virtual {v0}, Lm0/j0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lu/p2;->f:Lv/y;

    invoke-virtual {v0}, Lv/y;->b()Z

    move-result v0

    return v0
.end method

.method public final c(Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/p2;->f:Lv/y;

    invoke-virtual {v0, p1, p2, p3}, Lv/y;->c(Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lu/p2;->g:Lm0/j0;

    invoke-virtual {v0}, Lm0/j0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final e(F)F
    .locals 1

    iget-object v0, p0, Lu/p2;->f:Lv/y;

    invoke-virtual {v0, p1}, Lv/y;->e(F)F

    move-result p1

    return p1
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Lu/p2;->a:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    return v0
.end method
