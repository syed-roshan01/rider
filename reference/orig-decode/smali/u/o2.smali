.class public final Lu/o2;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final a:Lu/o2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu/o2;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Lu/o2;->a:Lu/o2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv0/d;

    check-cast p2, Lu/p2;

    invoke-virtual {p2}, Lu/p2;->f()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
