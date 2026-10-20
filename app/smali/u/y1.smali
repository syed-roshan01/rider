.class public final Lu/y1;
.super Ljava/lang/Object;

# interfaces
.implements Lu/b2;


# static fields
.field public static final a:Lu/y1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/y1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu/y1;->a:Lu/y1;

    return-void
.end method


# virtual methods
.method public final a(JILu/q2;)J
    .locals 0

    new-instance p3, Ld1/c;

    invoke-direct {p3, p1, p2}, Ld1/c;-><init>(J)V

    invoke-virtual {p4, p3}, Lu/q2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld1/c;

    iget-wide p1, p1, Ld1/c;->a:J

    return-wide p1
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final c()Ly0/o;
    .locals 1

    sget-object v0, Ly0/l;->b:Ly0/l;

    return-object v0
.end method

.method public final d(JLv/k2;Lu8/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lm2/p;

    invoke-direct {v0, p1, p2}, Lm2/p;-><init>(J)V

    invoke-virtual {p3, v0, p4}, Lv/k2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
