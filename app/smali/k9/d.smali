.class public final Lk9/d;
.super Ljava/lang/Object;

# interfaces
.implements Lk9/i;
.implements Lk9/c;


# static fields
.field public static final a:Lk9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk9/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lk9/d;->a:Lk9/d;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(I)Lk9/i;
    .locals 0

    sget-object p1, Lk9/d;->a:Lk9/d;

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    sget-object v0, Lr8/q;->a:Lr8/q;

    return-object v0
.end method
